package com.nomitech.viewsimplementation;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class webviewImplem extends AppCompatActivity {
 Button Google,Facebook,Skillsbuck,Youtube;
 WebView webView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_implem);
Google=(Button) findViewById(R.id.btnGoogle);
Facebook=(Button) findViewById(R.id.btnFacebook);
Youtube=(Button) findViewById(R.id.btnYoutube);
Skillsbuck=(Button) findViewById(R.id.btnSkillsBuck);

webView=(WebView) findViewById(R.id.webview);




Google.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        webView.setWebViewClient(new MyWebViewClient());
        String Url="https://www.google.com/";

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(Url);
    }
});

        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.setWebViewClient(new MyWebViewClient());
                String Url="https://www.facebook.com/";

                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(Url);
            }
        });

        Youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.setWebViewClient(new MyWebViewClient());
                String Url="https://www.youtube.com/";

                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(Url);
            }
        });

        Skillsbuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.setWebViewClient(new MyWebViewClient());
                String Url="https://www.skillsbuck.com/";

                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(Url);
            }
        });

    }
private class MyWebViewClient extends WebViewClient{
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {

       view.loadUrl(url);
        return true;
    }
}

}

