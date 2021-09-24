import java.util.Scanner;

public class GiaoDichNha extends GiaoDich {
	private String loaiNha;

	/**
	 * @return the loaiNha
	 */
	public String getLoaiNha() {
		return loaiNha;
	}

	/**
	 * @param loaiNha the loaiNha to set
	 */
	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}

	public GiaoDichNha() {
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
	public GiaoDichNha(String maGD, int ngay, int thang, int nam, float donGia, float dienTich, String loaiNha) {
		super(maGD, ngay, thang, nam, donGia, dienTich);
		this.loaiNha = loaiNha;
	}

	@Override
	public void nhap(Scanner scan) {

		super.nhap(scan);

		System.out.println("nhập loại nhà(thường, CaoCấp):");

		this.loaiNha = scan.nextLine();

	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\tloại nhà: " + this.loaiNha);

	}

	@Override
	public void tinhThanhTien() {

		if (this.loaiNha.equalsIgnoreCase("Cao Cấp")) {

			this.thanhTien = this.dienTich * this.donGia;
		} else {
			this.thanhTien = this.dienTich * this.donGia * 0.9f;

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
		text = "||" + formatTextCell(this.maGD) + "|";
		text += formatNumCell1(this.ngay, this.thang, this.nam) + "|";
		text += formatNumCell(this.donGia) + "|";
		text += formatNumCell(this.dienTich) + "|";
		text += formatTextCell(this.loaiNha) + "|";
		double tT =  (Math.round(this.thanhTien * 100.0)/100.0);
		text += formatNumCell(tT) + "||";

		System.out.println(text);

	}

}
