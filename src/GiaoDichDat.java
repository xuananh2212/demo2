import java.util.Scanner;

public class GiaoDichDat extends GiaoDich {
	private String loai;

	/**
	 * @return the loai
	 */
	public String getLoai() {
		return loai;
	}

	/**
	 * @param loai the loai to set
	 */
	public void setLoai(String loai) {
		this.loai = loai;
	}

	public GiaoDichDat() {
		super();
	}

	/**
	 * @param maGD
	 * @param ngay
	 * @param thang
	 * @param nam
	 * @param donGia
	 * @param dienTich
	 */
	public GiaoDichDat(String maGD, int ngay, int thang, int nam, float donGia, float dienTich, String loai) {
		super(maGD, ngay, thang, nam, donGia, dienTich);
		this.loai = loai;
	}

	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("nhập loại(A,B,C):");
		this.loai = scan.nextLine();
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("loại: " + this.loai);

	}

	@Override
	public void tinhThanhTien() {
		if (this.loai.equalsIgnoreCase("A")) {

			this.thanhTien = this.dienTich * this.donGia * 1.5f;
		} else if (this.loai.equalsIgnoreCase("B") || this.loai.equalsIgnoreCase("C")) {

			this.thanhTien = this.dienTich * this.donGia;
		}

	}

	private String formatNumCell1(Number num1, Number num2, Number num3) {

		String paddLight = "%5s";
		String paddRight = "%-14s";

		return String.format(paddLight, " ") + String.format(paddRight, " " + num1 + "/" + num2 + "/" + num3);
	}

	private String formatNumCell(Number num) {

		String paddLight = "%5s";
		String paddRight = "%-8s";

		return String.format(paddLight, " ") + String.format(paddRight, " " + num);
	}

	private String formatTextCell(String text) {

		String paddLight = "%-12s";
		return String.format(paddLight, " " + text);

	}

	public void formatRow() {
		String text;
		text = "||" + formatTextCell(this.maGD)+"|";
		text += formatNumCell1(this.ngay, this.thang, this.nam) + "|";
		text += formatNumCell(this.donGia) + "|";
		text += formatNumCell(this.dienTich) + "|";
		text += formatTextCell(this.loai) + "|";
		double tT =  (Math.round(this.thanhTien * 100.0)/100.0);
		text += formatNumCell(tT) + "||";

		System.out.println(text);

	}
}
