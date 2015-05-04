package com.tierconnect.jsplugins;

import com.vaadin.annotations.JavaScript;
import com.vaadin.annotations.StyleSheet;
import com.vaadin.ui.AbstractJavaScriptComponent;

/**
 * Created by carolasilvateran on 5/3/15.
 */
@StyleSheet({
        "vaadin://ae_va.css"
})

@JavaScript({

        "vaadin://jquery.min.js",
        "vaadin://jquery.easing.1.3.js",
        "vaadin://VarianceViewer.js",
        "vaadin://viewerInit.js"
})

public class VarianceViewer extends AbstractJavaScriptComponent {

}
