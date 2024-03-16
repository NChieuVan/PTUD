package model;

import java.time.LocalDate;

public class TaiKhoan {
	private String tenTaiKhoan;
	private String matKhau;
	private LocalDate ngayLap;
	private String ghiChu;
	private String vaiTro;
	
	public TaiKhoan(String tenTaiKhoan, String matKhau, LocalDate ngayLap, String ghiChu, String vaiTro) {
		super();
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
		this.ngayLap = ngayLap;
		this.ghiChu = ghiChu;
		this.vaiTro = vaiTro;
	}

	public TaiKhoan(String tenTaiKhoan, String matKhau, String vaiTro) {
		super();
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
		this.vaiTro = vaiTro;
	}

	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}

	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public LocalDate getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(LocalDate ngayLap) {
		this.ngayLap = ngayLap;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public String getVaiTro() {
		return vaiTro;
	}

	public void setVaiTro(String vaiTro) {
		this.vaiTro = vaiTro;
	}
	
	
	
}
