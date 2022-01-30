//use std::env;
use std::fs;

fn main(){
    let filename = "file.txt";
    println!("In file {}",filename);
    let cot = fs::read_to_string(filename).expect("Error");
    println!("Content : {}",cot);
}
