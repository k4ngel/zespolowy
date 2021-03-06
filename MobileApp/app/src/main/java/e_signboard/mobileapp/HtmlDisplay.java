package e_signboard.mobileapp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class HtmlDisplay extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String deviceName = getIntent().getStringExtra("device-name");

        setContentView(R.layout.activity_html_display);
        setTitle(deviceName);
        WebView localWebView = (WebView)findViewById(R.id.webView);

        localWebView.getSettings().setJavaScriptEnabled(true);
        localWebView.loadUrl("file:///"+getFilesDir()+"/"+deviceName+ "/index.html"); //new.html is html file name.
    }

}
