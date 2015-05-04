package com.tierconnect;


import com.tierconnect.jsplugins.VarianceViewer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by mmv on 5/3/15.
 */

public class VarianceUI extends UI {
    @Override
    public void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        Panel panel = new Panel("Aegis Test Slider");
        panel.setSizeUndefined();
        String html = "<div id=\"bigButton\" class=\"custom-button\">Show Variances</div><div class=\"ae-auto-init-ba\" data-lightbox=\"#bigButton\" data-width=\"800\" data-disableIntro=\"true\">\n" +
        "    <img src=\"images/exa_b.png\" alt='http://localhost:8085/VAADIN/themes/reindeer/layouts/images/exa_a.png' title=\"https://www.bankofamerica.com/\">\n" +
                "    <img src=\"images/exa_1a.png\" alt='http://localhost:8085/VAADIN/themes/reindeer/layouts/images/exa_1b.png' title=\"https://consumer.bankofamerica.com/USCCapp/Ctl/entry?sc=VACDQJ&cm_sp=Cons-CC-_-Card-Rewards-_-CCW4CHNU02_card4_hm_4tile2-e_arx5lvhp_s.gif#b\">\n" +
                "</div>";
//
//        String html = "<div class=\"ae-auto-init-ba\" data-width=\"800\" data-disableIntro=\"true\">\n" +
//                "    <img src=\"images/exa_b.png\" alt='http://localhost:8085/VAADIN/themes/reindeer/layouts/images/exa_a.png' title=\"https://www.bankofamerica.com/\">\n" +
//                "    <img src=\"images/exa_1a.png\" alt='http://localhost:8085/VAADIN/themes/reindeer/layouts/images/exa_1b.png' title=\"https://consumer.bankofamerica.com/USCCapp/Ctl/entry?sc=VACDQJ&cm_sp=Cons-CC-_-Card-Rewards-_-CCW4CHNU02_card4_hm_4tile2-e_arx5lvhp_s.gif#b\">\n" +
//                "</div>";
        try {
            CustomLayout custom = new CustomLayout(new ByteArrayInputStream(html.getBytes()));
            panel.setContent(custom);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        setContent(layout);
        VarianceViewer slider = new VarianceViewer();

        layout.addComponent(panel);
        layout.addComponent(slider);



    }
}
