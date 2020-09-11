<?php
    include('connect.php');
    $id=$_GET['id'];
    $result = $db->prepare("DELETE FROM contact WHERE ID= :memid");
    $result->bindParam(':memid', $id);
    $result->execute();
    header("location: index.html");
?>