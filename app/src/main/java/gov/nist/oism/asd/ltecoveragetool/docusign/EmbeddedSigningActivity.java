package gov.nist.oism.asd.ltecoveragetool.docusign;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import gov.nist.oism.asd.ltecoveragetool.R;


public class EmbeddedSigningActivity extends AppCompatActivity {

    public static final String SIGNING_URL = "SigningUrl";
    public static final String RECIPIENT_EMAIL = "RecipientEmail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embedded_signing);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // get the DocuSign URL for the embedded signing ceremony
        String url = getIntent().getStringExtra(SIGNING_URL);
        String recipientEmail = getIntent().getStringExtra(RECIPIENT_EMAIL);

        FragmentManager fm = getSupportFragmentManager();
        SigningFragment signingFragment = (SigningFragment) fm.findFragmentByTag(SigningFragment.TAG);
        if (signingFragment == null) {
            signingFragment = SigningFragment.newInstance(url, recipientEmail);
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_content, signingFragment, SigningFragment.TAG)
                    .commit();
        }
    }
}
