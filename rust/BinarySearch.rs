fn main(){
    //println!("Hello world");
    let r:bool  = binary_search(3);
    println!("{}",r);
}
fn binary_search(k:i32)-> bool {
    let arr = [1,2,3,4,5];
    let mut l = 0;
    let mut r = 4;
    while l < r {
        let tmp = (l + r)/2;
        if arr[tmp] == k{
            return true;
        }
        if arr[tmp] > k {
            r = tmp - 1;
        }
        else {
            l = tmp + 1;
        }
    }
    return false;
}
