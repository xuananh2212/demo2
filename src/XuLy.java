import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DanhSachGiaoDich gd = new DanhSachGiaoDich();
		gd.duLieuGia();
		doMenu(gd, scan);

	}

	public static void Menu() {

		System.out.println("\n1. nhập giao dịch đất");
		System.out.println("2. nhập giao dịch nhà");
		System.out.println("3. xuất giao dịch đất,nhà");
		System.out.println("4. tính Trung Bình Thành Tiền Giao Dịch Đất");
		System.out.println("5. tính Tổng Thành tiền giao dịch nhà");
		System.out.println("6. tính Tổng Thành tiền giao dịch đất");
		System.out.println("7. xuất các giao dịch của tháng ,năm do người dùng nhập");
		System.out.println("8. Thoát");

	}

	public static void doMenu(DanhSachGiaoDich gd, Scanner scan) {
		boolean flag = true;
		GiaoDich gd1;
		do {
			Menu();
			System.out.print("\nbạn chọn: ");
			int x = Integer.parseInt(scan.nextLine());
			switch (x) {

			case 1:
				gd1 = new GiaoDichDat();
				gd1.nhap(scan);
				gd.themVaoList(gd1);
				break;
			case 2:
				gd1 = new GiaoDichNha();
				gd1.nhap(scan);
				gd.themVaoList(gd1);
				break;
			case 3:
				gd.tinhThanhTien();
				gd.xuatFormat(gd.getListGiaoDich());
				break;
			case 4:
				gd.tinhThanhTien();
				gd.tinhTBThanhTienDat();
				System.out.println("Trung bình cộng  Thành tiền của giao dịch đất : " + gd.gettBThanhTienDat());
				break;

			case 5:
				gd.tinhThanhTien();
				gd.tinhDoanhThuNha();
				System.out.println("Tổng thành tiền giao dịch nhà: " + gd.getDoanhThuNha());
				break;
			case 6:
				gd.tinhDoanhThuDat();
				System.out.println("Tổng thành tiền giao dịch Đất: " + gd.getDoanhThuDat());
				break;
			case 7:
				gd.tinhThanhTien();
				System.out.print("tháng: ");
				int a = Integer.parseInt(scan.nextLine());
				System.out.print("năm: ");
				int b = Integer.parseInt(scan.nextLine());

				ArrayList<GiaoDich> list = gd.nhungGiaoDichTheoThangNam(a, b);
				if (list.size() > 0) {
					gd.xuatFormat(list);
				} else {

					System.out.println("không có giao dịch tháng: " + a + " năm:" + b);
				}
				break;
			case 8:
				flag = false;
				break;

			}

		} while (flag);

	}

}
