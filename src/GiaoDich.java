import java.util.Scanner;

public class GiaoDich {
	protected String maGD;
	protected int ngay;
	protected int thang;
	protected int nam;
	protected float donGia;
	protected float thanhTien;
	protected float dienTich;

	/**
	 * @return the maGD
	 */
	public String getMaGD() {
		return maGD;
	}

	/**
	 * @return the ngay
	 */
	public int getNgay() {
		return ngay;
	}

	/**
	 * @return the thang
	 */
	public int getThang() {
		return thang;
	}

	/**
	 * @return the nam
	 */
	public int getNam() {
		return nam;
	}

	/**
	 * @return the donGia
	 */
	public float getDonGia() {
		return donGia;
	}

	/**
	 * @return the thanhTen
	 */
	public float getThanhTen() {
		return thanhTien;
	}

	/**
	 * @return the dienTich
	 */
	public float getDienTich() {
		return dienTich;
	}

	/**
	 * @param maGD the maGD to set
	 */
	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}

	/**
	 * @param ngay the ngay to set
	 */
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	/**
	 * @param thang the thang to set
	 */
	public void setThang(int thang) {
		this.thang = thang;
	}

	/**
	 * @param nam the nam to set
	 */
	public void setNam(int nam) {
		this.nam = nam;
	}

	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	/**
	 * @param dienTich the dienTich to set
	 */
	public void setDienTich(float dienTich) {
		this.dienTich = dienTich;
	}

	public GiaoDich() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param maGD
	 * @param ngay
	 * @param thang
	 * @param nam
	 * @param donGia
	 * @param dienTich
	 */
	public GiaoDich(String maGD, int ngay, int thang, int nam, float donGia, float dienTich) {
		super();
		this.maGD = maGD;
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}

	public void nhap(Scanner scan) {

		System.out.print("mã giao dich: ");
		this.maGD = scan.nextLine();
		System.out.print(" nhập ngày:");
		this.ngay = Integer.parseInt(scan.nextLine());
		System.out.print("nhập tháng:");
		this.thang = Integer.parseInt(scan.nextLine());

		System.out.print("nhập năm:");
		this.nam = Integer.parseInt(scan.nextLine());

		System.out.print("nhập đơn giá : ");
		this.donGia = Float.parseFloat(scan.nextLine());
		System.out.print("nhập diện tích : ");
		this.dienTich = Float.parseFloat(scan.nextLine());

	}

	public void xuat() {

		System.out.print("mã giao dịch: " + this.maGD + "\tngày/tháng/năm" + this.ngay + "/" + this.thang + "/"
				+ this.nam + "\tđơn giá: " + this.donGia + "\t diện tích: " + this.dienTich + "\t thanhTien: "
				+ this.thanhTien);

	}

	public void tinhThanhTien() {
		this.thanhTien = 0;
	}

}
