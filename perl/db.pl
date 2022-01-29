#!/usr/bin/perl

use DBI;
use strict;

my $driver = "localhost:3306"; 
my $database = "TESTDB";
my $dsn = "DBI:$driver:database=$database";
my $userid = "root";
my $password = "admin12345";

my $dbh = DBI->connect($dsn, $userid, $password ) or die $DBI::errstr;