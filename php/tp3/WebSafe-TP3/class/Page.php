<?php 

class Page{
	
	/**
	 * Créer la page qui se trouve dans le dossier page
	 * @param string $page
	 */
	public static function build( $page ){
	
		ob_start();
		$path = dirname(__FILE__). "/../page";
			
		if( file_exists(  $path . "/" . $page . ".php" ))
				
			include_once( $path . "/" . $page . ".php" );
			
		else
		
			include_once( $path . "/404.php" );
		
		
		$content = ob_get_contents();
			
		ob_end_clean();
		
		echo $content;
		
	}
	
}