/**
 * Created by carolasilvateran on 5/3/15.
 */
com_tierconnect_jsplugins_VarianceViewer = function () {
    $(document).ready(function($){
        jQuery(".ae-auto-init-ba").VarianceViewer();
        AE.ResizeEngine();
    });
}