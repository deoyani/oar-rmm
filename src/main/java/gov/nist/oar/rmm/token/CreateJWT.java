/**
 * This software was developed at the National Institute of Standards and Technology by employees of
 * the Federal Government in the course of their official duties. Pursuant to title 17 Section 105
 * of the United States Code this software is not subject to copyright protection and is in the
 * public domain. This is an experimental system. NIST assumes no responsibility whatsoever for its
 * use by other parties, and makes no guarantees, expressed or implied, about its quality,
 * reliability, or any other characteristic. We would appreciate acknowledgement if the software is
 * used. This software can be redistributed and/or modified freely provided that any derivative
 * works bear some notice that they are derived from it, and any modified versions bear some notice
 * that they have been modified.
 * @author: Deoyani Nandrekar-Heinis
 */
package gov.nist.oar.rmm.token;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import io.jsonwebtoken.*;
import io.jsonwebtoken.impl.crypto.MacProvider;

import java.util.Base64;
import java.util.Date;   
/**
 * @author Deoyani Nandrekar-Heinis
 *
 */
public class CreateJWT {
  //Sample method to construct a JWT
    private String createJWTToken(String id, String issuer, String subject, long ttlMillis) {
     
        //The JWT signature algorithm we will be using to sign the token
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
     
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
     
        //We will sign our JWT with our ApiKey secret
//        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(apiKey.getSecret());
//        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
        Key secret = MacProvider.generateKey(SignatureAlgorithm.HS256);
       byte[] secretBytes = secret.getEncoded();
        String base64SecretBytes = Base64.getEncoder().encodeToString(secretBytes);

        //Let's set the JWT Claims
        JwtBuilder builder = Jwts.builder().setId(id)
                                    .setIssuedAt(now)
                                    .setSubject(subject)
                                    .setIssuer(issuer)
                                    .signWith(signatureAlgorithm, base64SecretBytes);
     
        //if it has been specified, let's add the expiration
        if (ttlMillis >= 0) {
        long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }
     
        //Builds the JWT and serializes it to a compact, URL-safe string
        return builder.compact();
    }
    
}

 
 
