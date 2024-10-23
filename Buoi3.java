package buoi3;

public class thongTin {
    public static String gioiTinh(boolean gt) {
        return gt ? "Nam" : "Nữ";
    }

    public static void main(String[] args) {
        String maSinhVien = "108581", hoTen = "Lê Anh Đức", ngaySinh = "03/04/2006";
        String khoa = "Công nghệ thông tin", diaChi = "Đà Nẵng", lop = "IT24B";
        String nganhHoc = "Khoa học máy tính", maLop = "IT24B108";
        int tuoi = 18;
        boolean gt = true; // Nam

        System.out.println("-----THÔNG TIN SINH VIÊN CHI TIẾT-----");
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh(gt));
        System.out.println("Lớp: " + lop);
        System.out.println("Mã lớp: " + maLop);
        System.out.println("Khoa: " + khoa);
        System.out.println("Ngành học: " + nganhHoc);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("--------------------HẾT--------------------");
    }
}
