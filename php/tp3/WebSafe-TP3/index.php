<?php 
	include_once("init.php");
?><!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

           <link  href="css/list.php" rel="stylesheet" type="text/css" media="all" />
        
    </head>
    <body>
        <!--[if lt IE 7]>
            <p class="browsehappy">Vous utilisez une version ancienne de votre navigateur. Veuillez <a href="http://browsehappy.com/">mettre à jour votre navigateur</a> </p>
        <![endif]-->

       
        
        <?php Page::build("header"); ?>
		<?php Page::build( $page ); ?>
		<?php Page::build( $page ); ?>
     

      <footer>
      
      </footer>
   
       
      
         
<script type="text/javascript">       

    // Add a script element as a child of the body
	function downloadJSAtOnload() {
		var element = document.createElement("script");
		element.src = "js/list.php";
		document.body.appendChild(element);
	
	}
	
	// Check for browser support of event handling capability
	if (window.addEventListener)
		window.addEventListener("load", downloadJSAtOnload, false);
	else if (window.attachEvent)
		window.attachEvent("onload", downloadJSAtOnload);
	else 
		window.onload = downloadJSAtOnload;

</script> 
         
       
    </body>
</html>
 