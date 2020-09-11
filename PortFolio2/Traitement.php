<?php
sesion_start();
$errmsg_arr = array();
$errflag = false;
/* Configuration */
$dbhost     = "localhost";
$dbname     = "formulaire";
$dbuser     = "root";
$dbpass     = "root";

/* Database Connection */
$conn = new PDO("mysql:host=$dbhost;dbname=$dbname",$dbuser,$dbpass);

/* New Data */

$nom = $_POST['nom'];
$email = $_POST['email'];
$message = $_POST['message'];

if($nom == ''){
    $errmsg_arr[] = 'Vous devez introduire votre nom';
    $errflag = true;
}
if($email = ''){
    $errmsg_arr[]= 'Vous devez introduire votre email';
    $errflag = true;
}
if($message =''){
    $errmsg_arr[]= 'Vous devez introduire votre message';
    $errflag = true;
}
if($errflag){
    $_SESSION['ERRMSG_ARR'] = $errmsg_arr;
    session_write_close();
    header("location: index.php");
    exit();
}
/* Query */
$sql = "INSERT INTO contact2 (nom,email,message) VALUES (:sas,:asas,:asafs)";
$q = $conn->prepare($sql);
$q->execute(array(':sas'=>$nom,':asas'=>$email,':asafs'=>$message));
header("location: contact-db.html");
?>