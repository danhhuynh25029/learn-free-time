use std::fs;
fn main(){
    let filename = "addresses.csv";
    println!("In file {}",filename);
    let cot = fs::read_to_string(filename).expect("Error");
    println!("{}",cot);
}