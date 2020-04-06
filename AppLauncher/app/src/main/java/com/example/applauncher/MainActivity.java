package com.example.applauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Btn=(Button) findViewById(R.id.Btn);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] links={
                        "http://www.ihatecilantro.com/",
                        "http://www.ismycomputeron.com/",
                        "http://www.ffffidget.com/",
                        "http://www.koalastothemax.com/",
                        "http://www.windows93.net/",
                        "http://www.burymewithmymoney.com/",
                        "http://www.instantostrich.com/",
                        "http://www.openthiswindow.com/",
                        "http://thesongthatdefinesyourlife.com/",
                        "http://www.sittingandsmiling.com/",
                        "http://www.doughnutkitten.com/",
                        "http://www.pieisgood.org/",
                        "http://www.justflipacoin.com/",
                        "http://www.pickledonkeyknife.com/",
                        "http://www.worldsdumbestgame.com/",
                        "http://www.nyan.cat/",
                        "http://www.crazycardtrick.com/",
                        "http://www.wtfshouldidowithmylife.com/",
                        "http://www.chickenonaraft.com/",
                        "http://www.flappy-2048.com/",
                        "http://www.whatyearisit.info/",
                        "http://www.tacospin.com/",
                        "http://www.thebestdinosaur.com/",
                        "http://www.hectorsalamanca.com/",
                        "http://www.skulltrumpet.com/",
                        "http://www.freeonlineflashlight.com/",
                        "http://www.corndogoncorndog.com/",
                        "http://www.yourmetricbirthday.com/",
                        "http://www.isitfridayyet.net/",
                        "http://www.tinytuba.com/",
                        "http://chihuahuaspin.com/",
                        "http://www.geokitten.com/",
                        "http://www.randomgoat.com/",
                        "http://www.rock-paper-scissors-game.com/",
                        "http://www.cant-not-tweet-this.com/",
                        "http://www.hardcoreprawnlawn.com/",
                        "http://www.iamaturtle.org/",
                        "http://www.shtuff.com/",
                        "http://www.patience-is-a-virtue.org/",
                        "http://www.drumsound.net/",
                        "http://www.plspetdoge.com/",
                        "http://www.watchpaintdry.online/",
                        "http://www.beesbeesbees.com/",
                        "http://www.clicktoremove.com/",
                        "http://www.remoji.com/",
                        "http://www.corgiorgy.com/",
                        "http://www.leaf.com/",
                        "http://www.astrohamster.com/",
                        "http://www.flyingoperapigs.com/",
                        "http://endless.horse/",
                        "http://www.isthat.mobi/",
                        "http://www.its-not-its.info/",
                        "http://www.crouton.net/",
                        "http://www.randomcolour.com/",
                        "http://www.agegeek.com/",
                        "http://www.d-e-f-i-n-i-t-e-l-y.com/",
                        "http://www.doesthedogdie.com/",
                        "http://www.polarbearinasnowstorm.com/",
                        "http://noot.space/",
                        "http://www.wutdafuk.com/",
                        "http://www.emojitracker.com/",
                        "http://potato.io/",
                        "http://www.emergencycompliment.com/",
                        "http://www.iamawesome.com/",
                        "http://www.onemillionlols.com/",
                        "http://www.pizzerialaferrera.com/",
                        "http://www.pleaselike.com/",
                        "http://www.spaceis.cool/",
                        "http://www.dandandan.net/",
                        "http://www.lacquerlacquer.com/",
                        "http://www.partridgegetslucky.com/",
                        "http://www.bouncingdvdlogo.com/",
                        "http://www.tencents.info/",
                        "http://www.tunnelsnakes.com/",
                        "http://www.ascii-middle-finger.com/",
                        "http://www.unicodesnowmanforyou.com/",
                        "http://www.buildshruggie.com/",
                        "http://www.salmonofcapistrano.com/",
                        "http://www.thispersondoesnotexist.com/",
                        "http://www.worldslongestwebsite.com/",
                        "http://www.youfellasleepwatchingadvd.com/",
                        "http://www.procatinator.com/",
                        "http://www.lalalaa.com/",
                        "http://dogs.are.the.most.moe/",
                        "http://potatoaroundmyroom.netlify.com/",
                        "http://www.niceonedad.com/",
                        "http://www.fallingfalling.com/",
                        "http://www.birdsong.fm/",
                        "http://www.rrrgggbbb.com/",
                        "http://blue.eastsidelag.com/",
                        "http://www.jeff.com/",
                        "http://www.didthanoskill.me/",
                        "http://www.boringboringboring.com/",
                        "http://www.cameronsworld.net/",
                        "http://www.pictureofhotdog.com/",
                        "http://www.sketchywebsite.net/",
                        "http://www.breadfish.nl/",
                        "http://www.gurka.se/",
                        "http://www.loopedforinfinity.com/",
                        "http://www.catwig.com/",
                        "http://www.badgerbadgerbadger.com/",
                        "http://www.existentialcrisis.com/",
                        "https://procatinator.com/",
                        "https://heeeeeeeey.com/",
                        "http://papertoilet.com/",
                        "https://corgiorgy.com/",
                        "http://www.slightlyinteresting.com/",
                        "plasmaglobe/plasma.asp",
                        "http://make-everything-ok.com/",
                        "https://findtheinvisiblecow.com/",
                        "http://iamawesome.com/",
                        "http://www.donothingfor2minutes.com/",
                        "https://omfgdogs.com/",
                        "http://fallingguy.com/",
                        "http://www.everydayim.com/",
                        "https://trypap.com/",
                        "https://www.randomthingstodo.com/",
                        "http://www.whatsmystarbucksname.com/",
                        "http://pixelsfighting.com/",
                        "http://popopopcorn.com/",
                        "https://ffffidget.com/",
                        "https://cant-not-tweet-this.com/",
                        "https://po.ta.to/",
                        "http://ihasabucket.com/",
                        "http://intotime.com/",
                        "http://koalastothemax.com/",
                        "http://corndogoncorndog.com/",
                        "http://whereisthesloth.com/",
                        "https://scanwiches.com/",
                        "http://hmpg.net/",
                        "https://theuselessweb.com/",
                        "http://www.pointless.com/",
                        "https://www.theuselesswebindex.com/"
                };
                int index=(int)(Math.random()*links.length);
                Uri address=Uri.parse(links[index]);
                Intent gotoAddress=new Intent(Intent.ACTION_VIEW,address);
                if(gotoAddress.resolveActivity(getPackageManager())!=null)
                    startActivity(gotoAddress);
            }
        });
    }
}
