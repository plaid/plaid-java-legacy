package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ExchangeTokenResponse {

    protected String accessToken;
    protected String stripeBankAccountToken;

    @JsonProperty("access_token")
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @JsonProperty("stripe_bank_account_token")
    public String getStripeBankAccountToken() {
        return stripeBankAccountToken;
    }

    public void setStripeBankAccountToken(String bankAccountToken) {
        this.stripeBankAccountToken = bankAccountToken;
    }

}
