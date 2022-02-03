fn main(){
    let n = fibo(3);
    println!("{}",n);
}
fn fibo(n:i32) -> i32{
    if n < 2{
        return n;
    }else{
        return fibo(n-1) + fibo(n-2);
    }
}