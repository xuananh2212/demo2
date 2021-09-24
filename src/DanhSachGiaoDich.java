import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachGiaoDich {
	private ArrayList<GiaoDich> listGiaoDich;
	private float tBThanhTienDat;
	private float doanhThuDat;
	private float doanhThuNha;
	// private int thang;
	// private int nam;

	/**
	 * @return the tBThanhTien
	 */
	public float gettBThanhTienDat() {
		return tBThanhTienDat;
	}

	/**
	 * @return the doanhThuDat
	 */
	public float getDoanhThuDat() {
		return doanhThuDat;
	}

	/**
	 * @return the doanhThuNha
	 */
	public float getDoanhThuNha() {
		return doanhThuNha;
	}

	/**
	 * @return the listGiaoDich
	 */
	public ArrayList<GiaoDich> getListGiaoDich() {
		return listGiaoDich;
	}

	/**
	 * @param listGiaoDich the listGiaoDich to set
	 */
	public void setListGiaoDich(ArrayList<GiaoDich> listGiaoDich) {
		this.listGiaoDich = listGiaoDich;
	}

	public DanhSachGiaoDich() {
		this.listGiaoDich = new ArrayList<GiaoDich>();

	}

	public void duLieuGia() {
		GiaoDich gd;
		gd = new GiaoDichDat("a1", 15, 9, 2011, 9.3f, 3.2f, "A");
		this.listGiaoDich.add(gd);
		gd = new GiaoDichDat("a2", 15, 7, 2021, 4.5f, 3.2f, "b");
		this.listGiaoDich.add(gd);
		gd = new GiaoDichDat("a3", 21, 9, 2013, 9.3f, 3.2f, "c");
		this.listGiaoDich.add(gd);
		gd = new GiaoDichDat("a4", 23, 9, 2013, 9.3f, 3f, "c");
		this.listGiaoDich.add(gd);
		gd = new GiaoDichNha("a5", 12, 9, 2013, 6, 2.2f, "thường");
		this.listGiaoDich.add(gd);
		gd = new GiaoDichNha("a6", 6, 9, 2012, 8, 4.2f, "cao cấp");
		this.listGiaoDich.add(gd);
		gd = new GiaoDichNha("a7", 9, 9, 2013, 4.3f, 5.2f, "thường");
		this.listGiaoDich.add(gd);
		gd = new GiaoDichNha("a8", 15, 9, 2019, 3.3f, 7.2f, "cao cấp");
		this.listGiaoDich.add(gd);

	}

	public void nhap(Scanner scan) {
		for (GiaoDich gd : this.listGiaoDich) {

			gd.nhap(scan);
		}

	}

	public void xuat() {
		for (GiaoDich gd : this.listGiaoDich) {

			gd.xuat();
		}

	}

	public void themVaoList(GiaoDich gd) {

		this.listGiaoDich.add(gd);

	}

	public void tinhTBThanhTienDat() {
		int count = 0;
		this.tBThanhTienDat = 0;
		for (GiaoDich gd : this.listGiaoDich) {

			if (gd instanceof GiaoDichDat) {
				this.tBThanhTienDat += gd.thanhTien;
				count++;
			}
		}
		this.tBThanhTienDat /= count;

	}

	public void tinhDoanhThuDat() {
		this.doanhThuDat = 0;
		for (GiaoDich gx : this.listGiaoDich) {

			if (gx instanceof GiaoDichDat) {

				this.doanhThuDat += gx.thanhTien;
			}

		}

	}

	public void tinhThanhTien() {

		for (GiaoDich gd : this.listGiaoDich) {

			gd.tinhThanhTien();
		}

	}

	public void tinhDoanhThuNha() {
		this.doanhThuNha = 0;
		for (GiaoDich gd : this.listGiaoDich) {

			if (gd instanceof GiaoDichNha) {
				this.doanhThuNha += gd.thanhTien;
			}

		}

	}

	public ArrayList<GiaoDich> nhungGiaoDichTheoThangNam(int thang, int nam) {

		ArrayList<GiaoDich> listThangNam = new ArrayList<GiaoDich>();

		for (GiaoDich gd : this.listGiaoDich) {

			if (gd.getThang() == thang && gd.getNam() == nam) {

				listThangNam.add(gd);

			}

		}
		return listThangNam;
	}

	public void xuatLine() {

		System.out.println("===========================================================================================");
	}

	public String formatCell(String paddLeft, String tile, String paddRight) {

		return String.format(paddLeft, " ") + tile + String.format(paddRight, " ");

	}

	public void XuatRowhead1() {
		String paddString = "%1s";
		String paddString0 = "%2s";
		String paddString1 = "%3s";
		String paddString2 = "%4s";
		String paddString3 = "%5s";
		String paddString4 = "%8s";
		
		String text;
		text = "||" + formatCell(paddString0, "mã GD", paddString3) + "|";
		text += formatCell(paddString2, "ngày GD", paddString4) + "|";
		text += formatCell(paddString0, "Đơn giá", paddString2) + "|";
		text += formatCell(paddString0, "Diện Tích", paddString0) + "|";
		text += formatCell(paddString2, "loại", paddString2) + "|";
		text += formatCell(paddString1, "ThànhTiền", paddString) + "||";
		System.out.println(text);

	}

	public void xuatFormat(ArrayList<GiaoDich> list) {
		xuatLine();
		XuatRowhead1();
		xuatLine();
		for (GiaoDich gd : list) {

			if (gd instanceof GiaoDichDat) {
				((GiaoDichDat) gd).formatRow();

			} else if (gd instanceof GiaoDichNha) {

				((GiaoDichNha) gd).formatRow();
			}

		}
		xuatLine();

	}

}
