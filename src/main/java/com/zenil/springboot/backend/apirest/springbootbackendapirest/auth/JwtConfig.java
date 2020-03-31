package com.zenil.springboot.backend.apirest.springbootbackendapirest.auth;

/**
 * JwtConfig
 */
public class JwtConfig {
    public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";

    public static final String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\r\n"
            + "MIIEowIBAAKCAQEA2Ozxubv60c+LbFF1Hn7oaim5gxsNOLdgq0LnujTgsj9NI0Rj\r\n"
            + "hF8qiEdp+WolHp4qz4Al50CY3mg6G8d1T94vrpjjKx8sn/29y04OQMGZvr32Sjvd\r\n"
            + "pxZeoWDk5Xk52VwfHZxd5UXCRGWDnFfUt8SVVTstfutpQaA8H3FhvXILU9k/3FuT\r\n"
            + "wv+JqHsba0IgJWRg7rxwAKdPQn16BOJkP3t2mpSwKVAZ/6XqlKl2sCDe+ADK881J\r\n"
            + "fQPjud3nw68FXq7CtPjIXO6zy1UnLXw+mPTpictXq5nxLkKHKxkdpT51S6ZnZkuo\r\n"
            + "9stlew9wjtX4mcLKORYS/FnSOOFlW+RkbZSOYwIDAQABAoIBAE8ymsI73kPxqS5/\r\n"
            + "wunCXao8140FOFuHn9SHFcFHAu4w7EG++zJd6FJe+FLmLO0zw9+EItJ+JBG3Ldfs\r\n"
            + "h2kEbpYpHW8l743t/vgV5GBCDpa0FhJeLvuM0DnM/WTGUJeJ6ZZO+3z0bgu4oEdZ\r\n"
            + "TcFWFUtL0r1uxzv9e1XjeFLJK1eN4i4NuRKunse3BWbGxQCpSm4IpUpSaiDQRW+7\r\n"
            + "NTVtK+Q7xPcRWVkpLc9wa+DOK0jsIvuLKfYu8Xfc0/YxH7Z1pKNH17IlzWJN5bEv\r\n"
            + "hcVRxhFg+HcZ3LiZB18+TvGAqtUV1mxMqtQ8WxHb4IzJc8WX3d9AYk6NuloMZNjV\r\n"
            + "YhnrXYECgYEA+9JrRaeTAdEbe+zhZ4vbBG2m5K3fkSTr79k2UcryQ9c6DenGrRAb\r\n"
            + "KhHZ6elM35piS2j2m5PLpjqTlEELaNq6YuEo/vhZaOM51CruhEbFRfWrr/OCSKLH\r\n"
            + "8kbs4Awy1+EbmuXNqMQVzbS6rZdeVsjJfj1tHkmd1HLpVsXkBnNYLKMCgYEA3IZO\r\n"
            + "rnW6gyFL5zOyDFPA0Hruaeu3yQl13nADBnRhz6QrYkpBCnnjScvv9xImaZ5bBPGJ\r\n"
            + "6vT9Zfa2NU5k2dDQXBgcO5isG7uS2F0x7dbkrRlp+/bDz4GmILHpTeqI42x7diAw\r\n"
            + "CMTpfdDvQPmQeD0amTVsGn0Lmuo99L6y4lWMc0ECgYBgWl7ZRAknxM7zV+vXJtgi\r\n"
            + "laIqFa1ZZ/suxrnWCgUwmAWKlUyDo4oBSttKeQ4E8JlzqTHSzXY6oGcfbtPixu5S\r\n"
            + "Lzz0ciojy+2wlMy2qC2LWzjaFh5flIlU1naEM6awm11oo01RqdV95A0ZprVeF22h\r\n"
            + "c/dwg1J0m5NUtFtPbIrsaQKBgFSxuHJEgNdv6Ejpj84wNHNdY0eG4lTxrzU469CE\r\n"
            + "zjQDJy5eulAds+9ZxdWsQNh7mxVw9rkoUlHgyOX8L7t/+SYFlIJHBoK4LZOvZ0ej\r\n"
            + "KrxYcF32zglaD8WqzqHAG8bMmTYq8ofLqKlLnzfjIVssjJSe8d/SeqyKnjTrMKTA\r\n"
            + "mmqBAoGBANU2BgAHCJnXf/o79hlWk147kZjJhzN8LrNYUBOjBpZvC5R79gT2zIZ7\r\n"
            + "1j3WZnD6TrOfA5knTWmxzmix4oDj15kIG34m40km/hfxzR8noORJfjTPWdXrZ2UQ\r\n"
            + "w1+PdN+pFxZvYsgOM7EIyEQH3pKjob/n8b3ieTiZAbqQRHt7+RCU\r\n" + "-----END RSA PRIVATE KEY-----";

    public static final String RSA_PUBLIC = "-----BEGIN PUBLIC KEY-----\r\n"
            + "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2Ozxubv60c+LbFF1Hn7o\r\n"
            + "aim5gxsNOLdgq0LnujTgsj9NI0RjhF8qiEdp+WolHp4qz4Al50CY3mg6G8d1T94v\r\n"
            + "rpjjKx8sn/29y04OQMGZvr32SjvdpxZeoWDk5Xk52VwfHZxd5UXCRGWDnFfUt8SV\r\n"
            + "VTstfutpQaA8H3FhvXILU9k/3FuTwv+JqHsba0IgJWRg7rxwAKdPQn16BOJkP3t2\r\n"
            + "mpSwKVAZ/6XqlKl2sCDe+ADK881JfQPjud3nw68FXq7CtPjIXO6zy1UnLXw+mPTp\r\n"
            + "ictXq5nxLkKHKxkdpT51S6ZnZkuo9stlew9wjtX4mcLKORYS/FnSOOFlW+RkbZSO\r\n" + "YwIDAQAB\r\n"
            + "-----END PUBLIC KEY-----";
}