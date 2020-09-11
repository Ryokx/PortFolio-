<?php
/* Database config */
$db_host        = 'localhost';
$db_user        = 'root';
$db_pass        = 'root';
$db_database    = 'formulaire';

/* End Config */

$db = new PDO('mysql:host=' .$db_host. ';dbname='.$db_databse, $db_user, $db_pass);
$db->setAttribute(PDO::ATTR_ERRMODE, PDO::ERMODE_EXCEPTION);

?>
