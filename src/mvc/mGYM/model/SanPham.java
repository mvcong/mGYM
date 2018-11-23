package mvc.mGYM.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SanPham implements Comparable<SanPham> {

	@Id
	public String maSP;
	public String tenSP;
	public String loaiSP;
	public String soLuong;
	public String donVi;
	public Date ngayNhapHang;
	public String hsd;
	public Double giaSP;
	@ManyToOne
	public NhanVien nhanVien;
	@ManyToOne
	public ThanhVien thanhVien;
	public Date thoiGianCapNhat;

	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SanPham(String maSP, String tenSP, String loaiSP, String soLuong, String donVi, Date ngayNhapHang,
			String hsd, Double giaSP, NhanVien nhanVien, ThanhVien thanhVien, Date thoiGianCapNhat) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.soLuong = soLuong;
		this.donVi = donVi;
		this.ngayNhapHang = ngayNhapHang;
		this.hsd = hsd;
		this.giaSP = giaSP;
		this.nhanVien = nhanVien;
		this.thanhVien = thanhVien;
		this.thoiGianCapNhat = thoiGianCapNhat;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getLoaiSP() {
		return loaiSP;
	}

	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}

	public String getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(String soLuong) {
		this.soLuong = soLuong;
	}

	public String getDonVi() {
		return donVi;
	}

	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}

	public Date getNgayNhapHang() {
		return ngayNhapHang;
	}

	public void setNgayNhapHang(Date ngayNhapHang) {
		this.ngayNhapHang = ngayNhapHang;
	}

	public String getHsd() {
		return hsd;
	}

	public void setHsd(String hsd) {
		this.hsd = hsd;
	}

	public Double getGiaSP() {
		return giaSP;
	}

	public void setGiaSP(Double giaSP) {
		this.giaSP = giaSP;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setQuanTri(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public ThanhVien getThanhVien() {
		return thanhVien;
	}

	public void setThanhVien(ThanhVien thanhVien) {
		this.thanhVien = thanhVien;
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
		result = prime * result + ((donVi == null) ? 0 : donVi.hashCode());
		result = prime * result + ((giaSP == null) ? 0 : giaSP.hashCode());
		result = prime * result + ((hsd == null) ? 0 : hsd.hashCode());
		result = prime * result + ((loaiSP == null) ? 0 : loaiSP.hashCode());
		result = prime * result + ((maSP == null) ? 0 : maSP.hashCode());
		result = prime * result + ((ngayNhapHang == null) ? 0 : ngayNhapHang.hashCode());
		result = prime * result + ((nhanVien == null) ? 0 : nhanVien.hashCode());
		result = prime * result + ((soLuong == null) ? 0 : soLuong.hashCode());
		result = prime * result + ((tenSP == null) ? 0 : tenSP.hashCode());
		result = prime * result + ((thanhVien == null) ? 0 : thanhVien.hashCode());
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
		SanPham other = (SanPham) obj;
		if (donVi == null) {
			if (other.donVi != null)
				return false;
		} else if (!donVi.equals(other.donVi))
			return false;
		if (giaSP == null) {
			if (other.giaSP != null)
				return false;
		} else if (!giaSP.equals(other.giaSP))
			return false;
		if (hsd == null) {
			if (other.hsd != null)
				return false;
		} else if (!hsd.equals(other.hsd))
			return false;
		if (loaiSP == null) {
			if (other.loaiSP != null)
				return false;
		} else if (!loaiSP.equals(other.loaiSP))
			return false;
		if (maSP == null) {
			if (other.maSP != null)
				return false;
		} else if (!maSP.equals(other.maSP))
			return false;
		if (ngayNhapHang == null) {
			if (other.ngayNhapHang != null)
				return false;
		} else if (!ngayNhapHang.equals(other.ngayNhapHang))
			return false;
		if (nhanVien == null) {
			if (other.nhanVien != null)
				return false;
		} else if (!nhanVien.equals(other.nhanVien))
			return false;
		if (soLuong == null) {
			if (other.soLuong != null)
				return false;
		} else if (!soLuong.equals(other.soLuong))
			return false;
		if (tenSP == null) {
			if (other.tenSP != null)
				return false;
		} else if (!tenSP.equals(other.tenSP))
			return false;
		if (thanhVien == null) {
			if (other.thanhVien != null)
				return false;
		} else if (!thanhVien.equals(other.thanhVien))
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
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", loaiSP=" + loaiSP + ", soLuong=" + soLuong + ", donVi="
				+ donVi + ", ngayNhapHang=" + ngayNhapHang + ", hsd=" + hsd + ", giaSP=" + giaSP + ", quanTri="
				+ nhanVien + ", thanhVien=" + thanhVien + ", thoiGianCapNhat=" + thoiGianCapNhat + "]";
	}

	@Override
	public int compareTo(SanPham o) {
		// TODO Auto-generated method stub
		return this.maSP.compareTo(o.maSP);
	}

}
