<?php 

include_once( dirname(__FILE__) . "/func/func.php" );
include_once( dirname(__FILE__) ."/class/Page.php" );

$page = "home";
if( isset( $_GET["page"] ) )
	$page = $_GET["page"];