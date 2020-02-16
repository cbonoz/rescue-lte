package gov.nist.oism.asd.ltecoveragetool;

import androidx.multidex.MultiDexApplication;

import gov.nist.oism.asd.ltecoveragetool.docusign.EnvelopesHelper;
import gov.nist.oism.asd.ltecoveragetool.docusign.esign.client.ApiClient;
import gov.nist.oism.asd.ltecoveragetool.docusign.esign.model.LoginAccount;

/**
 * Application class
 */

public class SampleApp extends MultiDexApplication {

    private static final String TAG = SampleApp.class.getSimpleName();

    /**
     * Application object
     */
    private static SampleApp sApp;
    /**
     * AccessToken for authentication
     */
    public static final String mAccessToken = Constants.DOCUSIGN_ACCESS_TOKEN;
    public static final String accountId = "473679ad-e603-4c19-9e54-5a3ff887d758";
    /**
     * LoginAccount for account info
     */
    private LoginAccount mAccount;
    public final EnvelopesHelper envelopesHelper = new EnvelopesHelper(new ApiClient());
    private String mLastEnvelopeId;

    public static SampleApp getInstance() {
        return sApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sApp = this;
        setLoginAccount(new LoginAccount());
        getLoginAccount().setAccountId(accountId);
        getLoginAccount().setName("Chris");
    }


    public String getAccessToken() {
        return mAccessToken;
    }

    public LoginAccount getLoginAccount() {
        return mAccount;
    }

    public void setLoginAccount(LoginAccount account) {
        mAccount = account;
    }

    public String getLastEnvelopeId() {
        return mLastEnvelopeId;
    }

    public void setLastEnvelopeId(String lastEnvelopeId) {
        mLastEnvelopeId = lastEnvelopeId;
    }

}



