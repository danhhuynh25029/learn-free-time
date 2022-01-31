mod module;
fn main(){
    let a:i32 = max_two();
    println!("{}",a);
    let show = |sms|{
        println!("{}",sms);
    };
    show("Danh");
    module::test::test_function();
}

fn max_two() -> i32{
    let arr = [5,3,4,2,1];
    let mut m1:i32 = arr[0];
    let mut m2:i32 = arr[1];
    for i in 0..arr.len(){
        if arr[i] > m1{
           m2 = m1;
           m1 = arr[i];
        }
        // println!("{}",i);
    }
    return m2;
}
