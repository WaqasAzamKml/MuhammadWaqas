package com.dozygeek.muhammadwaqas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.vansuita.materialabout.builder.AboutBuilder;
import com.vansuita.materialabout.views.AboutView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AboutView view = AboutBuilder.with(this)
                .setPhoto(R.drawable.photo2)
                .setCover(R.drawable.photo1)
                .setName("Muhammad Waqas")
                .setSubTitle("Full Stack Android Developer")
                .setBrief("Extremely motivated to constantly develop my skills and grow professionally.\n" +
                        "I am confident in my ability to come up with interesting ideas." +
                        " And my aim is to build something that solves some real problems")
                .setAppIcon(R.mipmap.ic_launcher)
                .setAppName(R.string.app_name)
                .setDividerDashGap(20)
                .setLinksColumnsCount(3)
                .addGooglePlayStoreLink("8002078663318221363")
                .addGitHubLink("WaqasAzamKml")
                .addFacebookLink("DozyGeek")
                .addTwitterLink("WaqasAzamKml")
                .addInstagramLink("WaqasAzamKml")
                .addGooglePlusLink("+MuhammadWaqasAzam")
                .addLinkedInLink("arleu-cezar-vansuita-júnior-83769271")
                .addEmailLink("waqasazamkml@gmail.com")
                .addMoreFromMeAction("Vansuita")
                .addFeedbackAction("waqasazamkml@gmail.com")
                .addFiveStarsAction()
                .setVersionNameAsAppSubTitle()
                .addShareAction(R.string.app_name)
                .setWrapScrollView(true)
                .setLinksAnimated(true)
                .setShowAsCard(true)
                .build();

        ViewGroup.LayoutParams layoutParams =
                new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT);

        addContentView(view, layoutParams);
    }
}
