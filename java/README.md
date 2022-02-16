khi ninh click vao o tim kiem va nhan enter la method get 
getParaMeterValues
khi query du lieu thi no tra ve resultset
authentication => he thong kiem tra ban co ton tai trong he thong hay khong
authoriazation => kiem tra ban thuoc vai tro nao
jdbc khong phai la anh xa tu java class
hibernate JPA => can tim hieu ORM(Object Relational Mapping)
Access Modifier =>(private,public,protected,default)(quan ly truy cap trong) khi khong co khai bao
thi mac dinh la default
model : noi lay du lieu tu database
controller noi minh hienr a jsp
view : jsp
forward chuyen yeu cau toi servlet khac de xu ly
Request thong tin gui tu client toi server{
	Ai tao request
	Du lieub user nhap vao
	HTTP header
}
Response {
	Thong tin server tra ve cho client,
	vd cookie,image,text,Http header
}
doGet{
	khi go dia chi vao trinh duyet va an enter thi doGet thuc hien
	bi gioi han khich thuoc du lieu va chi gui dang text co the thay duoc tren thanh dia chi
	dung doGet de luan chuyen trang va dung doPost de update data trong database
}
doPost{
	khic thuoc du lieu khong du lieu,va co the gui duoc moi thu
	khong thay tren thanh du lieu
}
mo hinh model view controller v1{
	UserDao chua lenh jdbc lay du lieu tu database,insert,delete
	User la 1 class luu doi tuong
}
String[] list = req.getParaMeterValues lay tat ca du lieu trong checkbox thanh 1 mang ky tu
ServletOutputStream duoc dung de ghi du lieu nhi phan
cookie duoc luu trong trinh duyet  co key values duoc gui kem trong moi lan client gui trinh duyet yeu cau len server
jsp xu ly serverside bang cong nghe java
jsp:include tai thoi diem client gui yeu cau
<%@ include file=""%> tai thoi diem thong dich servlet khien duy lieu trang lon hon vi no lay may trang kia bo vo luon
JSP Directives, Page directive la cac lop mo rong cac thuoc tinh cac thu vien
Request.getParameter() tra ve String con getAttribute thi tra ve 1 object
mac dinh cua interface la public
lam giao dien login nho username va password{
	cookie luu trong response tra ve client
	cookie nen duoc code trong servlet
}
String duoc luu trong vung nho dac biet co ten pool
String immutable no bat bien{
	khong the thay doi
	String literal
	String str = "danh";
	nen su dung vi no se kiem tra trong pool co ton tai chua va no se khong tao ra
	tiet kiem bo nho
}
