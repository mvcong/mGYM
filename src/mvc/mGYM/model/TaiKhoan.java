package mvc.mGYM.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class TaiKhoan implements Comparable<TaiKhoan> {

	@Id
	public String maTK;
	public String tenTK;
	public String matKhau;
	public String quyenTK;
	public String loaiTK;
	public Boolean trangThaiHoatDong;
	public Date ngayLap;
	@ManyToOne
	public NhanVien nhanVien;
	@ManyToOne
	public ThanhVien thanhVien;
	public Date thoiGianCapNhat;

	public TaiKhoan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaiKhoan(String maTK, String tenTK, String matKhau, String quyenTK, String loaiTK, Boolean trangThaiHoatDong,
			Date ngayLap, NhanVien nhanVien, ThanhVien thanhVien, Date thoiGianCapNhat) {
		super();
		this.maTK = maTK;
		this.tenTK = tenTK;
		this.matKhau = matKhau;
		this.quyenTK = quyenTK;
		this.loaiTK = loaiTK;
		this.trangThaiHoatDong = trangThaiHoatDong;
		this.ngayLap = ngayLap;
		this.nhanVien = nhanVien;
		this.thanhVien = thanhVien;
		this.thoiGianCapNhat = thoiGianCapNhat;
	}

	public String getMaTK() {
		return maTK;
	}

	public void setMaTK(String maTK) {
		this.maTK = maTK;
	}

	public String getTenTK() {
		return tenTK;
	}

	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getQuyenTK() {
		return quyenTK;
	}

	public void setQuyenTK(String quyenTK) {
		this.quyenTK = quyenTK;
	}

	public String getLoaiTK() {
		return loaiTK;
	}

	public void setLoaiTK(String loaiTK) {
		this.loaiTK = loaiTK;
	}

	public Boolean getTrangThaiHoatDong() {
		return trangThaiHoatDong;
	}

	public void setTrangThaiHoatDong(Boolean trangThaiHoatDong) {
		this.trangThaiHoatDong = trangThaiHoatDong;
	}

	public Date getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
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
		result = prime * result + ((loaiTK == null) ? 0 : loaiTK.hashCode());
		result = prime * result + ((maTK == null) ? 0 : maTK.hashCode());
		result = prime * result + ((matKhau == null) ? 0 : matKhau.hashCode());
		result = prime * result + ((ngayLap == null) ? 0 : ngayLap.hashCode());
		result = prime * result + ((nhanVien == null) ? 0 : nhanVien.hashCode());
		result = prime * result + ((quyenTK == null) ? 0 : quyenTK.hashCode());
		result = prime * result + ((tenTK == null) ? 0 : tenTK.hashCode());
		result = prime * result + ((thanhVien == null) ? 0 : thanhVien.hashCode());
		result = prime * result + ((thoiGianCapNhat == null) ? 0 : thoiGianCapNhat.hashCode());
		result = prime * result + ((trangThaiHoatDong == null) ? 0 : trangThaiHoatDong.hashCode());
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
		TaiKhoan other = (TaiKhoan) obj;
		if (loaiTK == null) {
			if (other.loaiTK != null)
				return false;
		} else if (!loaiTK.equals(other.loaiTK))
			return false;
		if (maTK == null) {
			if (other.maTK != null)
				return false;
		} else if (!maTK.equals(other.maTK))
			return false;
		if (matKhau == null) {
			if (other.matKhau != null)
				return false;
		} else if (!matKhau.equals(other.matKhau))
			return false;
		if (ngayLap == null) {
			if (other.ngayLap != null)
				return false;
		} else if (!ngayLap.equals(other.ngayLap))
			return false;
		if (nhanVien == null) {
			if (other.nhanVien != null)
				return false;
		} else if (!nhanVien.equals(other.nhanVien))
			return false;
		if (quyenTK == null) {
			if (other.quyenTK != null)
				return false;
		} else if (!quyenTK.equals(other.quyenTK))
			return false;
		if (tenTK == null) {
			if (other.tenTK != null)
				return false;
		} else if (!tenTK.equals(other.tenTK))
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
		if (trangThaiHoatDong == null) {
			if (other.trangThaiHoatDong != null)
				return false;
		} else if (!trangThaiHoatDong.equals(other.trangThaiHoatDong))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TaiKhoan [maTK=" + maTK + ", tenTK=" + tenTK + ", matKhau=" + matKhau + ", quyenTK=" + quyenTK
				+ ", loaiTK=" + loaiTK + ", trangThaiHoatDong=" + trangThaiHoatDong + ", ngayLap=" + ngayLap
				+ ", nhanVien=" + nhanVien + ", thanhVien=" + thanhVien + ", thoiGianCapNhat="
				+ thoiGianCapNhat + "]";
	}

	@Override
	public int compareTo(TaiKhoan o) {
		// TODO Auto-generated method stub
		return this.maTK.compareTo(o.maTK);
	}
}
