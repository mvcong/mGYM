package mvc.mGYM.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ThanhVien implements Comparable<ThanhVien> {

	@Id
	public String maTV;
	public String tenTV;
	public String gioiTinh;
	public Date ngaySinh;
	public String sDT;
	public String email;
	public String diaChi;
	public Date thoiGianCapNhat;

	public ThanhVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThanhVien(String maTV, String tenTV, String gioiTinh, Date ngaySinh, String sDT, String email, String diaChi,
			Date thoiGianCapNhat) {
		super();
		this.maTV = maTV;
		this.tenTV = tenTV;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.sDT = sDT;
		this.email = email;
		this.diaChi = diaChi;
		this.thoiGianCapNhat = thoiGianCapNhat;
	}

	public String getMaTV() {
		return maTV;
	}

	public void setMaTV(String maTV) {
		this.maTV = maTV;
	}

	public String getTenTV() {
		return tenTV;
	}

	public void setTenTV(String tenTV) {
		this.tenTV = tenTV;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getsDT() {
		return sDT;
	}

	public void setsDT(String sDT) {
		this.sDT = sDT;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Date getThoiGianCapNhat() {
		return thoiGianCapNhat;
	}

	public void setThoiGianCapNhat(Date thoiGianCapNhat) {
		this.thoiGianCapNhat = thoiGianCapNhat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diaChi == null) ? 0 : diaChi.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((gioiTinh == null) ? 0 : gioiTinh.hashCode());
		result = prime * result + ((maTV == null) ? 0 : maTV.hashCode());
		result = prime * result + ((ngaySinh == null) ? 0 : ngaySinh.hashCode());
		result = prime * result + ((sDT == null) ? 0 : sDT.hashCode());
		result = prime * result + ((tenTV == null) ? 0 : tenTV.hashCode());
		result = prime * result + ((thoiGianCapNhat == null) ? 0 : thoiGianCapNhat.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ThanhVien other = (ThanhVien) obj;
		if (diaChi == null) {
			if (other.diaChi != null)
				return false;
		} else if (!diaChi.equals(other.diaChi))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gioiTinh == null) {
			if (other.gioiTinh != null)
				return false;
		} else if (!gioiTinh.equals(other.gioiTinh))
			return false;
		if (maTV == null) {
			if (other.maTV != null)
				return false;
		} else if (!maTV.equals(other.maTV))
			return false;
		if (ngaySinh == null) {
			if (other.ngaySinh != null)
				return false;
		} else if (!ngaySinh.equals(other.ngaySinh))
			return false;
		if (sDT == null) {
			if (other.sDT != null)
				return false;
		} else if (!sDT.equals(other.sDT))
			return false;
		if (tenTV == null) {
			if (other.tenTV != null)
				return false;
		} else if (!tenTV.equals(other.tenTV))
			return false;
		if (thoiGianCapNhat == null) {
			if (other.thoiGianCapNhat != null)
				return false;
		} else if (!thoiGianCapNhat.equals(other.thoiGianCapNhat))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ThanhVien [maTV=" + maTV + ", tenTV=" + tenTV + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh
				+ ", sDT=" + sDT + ", email=" + email + ", diaChi=" + diaChi + ", thoiGianCapNhat=" + thoiGianCapNhat
				+ "]";
	}

	@Override
	public int compareTo(ThanhVien o) {
		// TODO Auto-generated method stub
		return this.maTV.compareTo(o.maTV);
	}

}
