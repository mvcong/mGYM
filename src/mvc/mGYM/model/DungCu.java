package mvc.mGYM.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DungCu implements Comparable<DungCu> {

	@Id
	public String maDC;
	public String tenDC;
	public String loaiDC;
	public Date ngayNhap;
	public String hsd;
	public double giaMua;
	@ManyToOne
	public NhanVien nhanVien;
	public Date thoiGianCapNhat;

	public DungCu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DungCu(String maDC, String tenDC, String loaiDC, Date ngayNhap, String hsd, double giaMua, NhanVien nhanVien,
			Date thoiGianCapNhat) {
		super();
		this.maDC = maDC;
		this.tenDC = tenDC;
		this.loaiDC = loaiDC;
		this.ngayNhap = ngayNhap;
		this.hsd = hsd;
		this.giaMua = giaMua;
		this.nhanVien = nhanVien;
		this.thoiGianCapNhat = thoiGianCapNhat;
	}

	public String getMaDC() {
		return maDC;
	}

	public void setMaDC(String maDC) {
		this.maDC = maDC;
	}

	public String getTenDC() {
		return tenDC;
	}

	public void setTenDC(String tenDC) {
		this.tenDC = tenDC;
	}

	public String getLoaiDC() {
		return loaiDC;
	}

	public void setLoaiDC(String loaiDC) {
		this.loaiDC = loaiDC;
	}

	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public String getHsd() {
		return hsd;
	}

	public void setHsd(String hsd) {
		this.hsd = hsd;
	}

	public double getGiaMua() {
		return giaMua;
	}

	public void setGiaMua(double giaMua) {
		this.giaMua = giaMua;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setQuanTri(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
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
		long temp;
		temp = Double.doubleToLongBits(giaMua);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hsd == null) ? 0 : hsd.hashCode());
		result = prime * result + ((loaiDC == null) ? 0 : loaiDC.hashCode());
		result = prime * result + ((maDC == null) ? 0 : maDC.hashCode());
		result = prime * result + ((ngayNhap == null) ? 0 : ngayNhap.hashCode());
		result = prime * result + ((nhanVien == null) ? 0 : nhanVien.hashCode());
		result = prime * result + ((tenDC == null) ? 0 : tenDC.hashCode());
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
		DungCu other = (DungCu) obj;
		if (Double.doubleToLongBits(giaMua) != Double.doubleToLongBits(other.giaMua))
			return false;
		if (hsd == null) {
			if (other.hsd != null)
				return false;
		} else if (!hsd.equals(other.hsd))
			return false;
		if (loaiDC == null) {
			if (other.loaiDC != null)
				return false;
		} else if (!loaiDC.equals(other.loaiDC))
			return false;
		if (maDC == null) {
			if (other.maDC != null)
				return false;
		} else if (!maDC.equals(other.maDC))
			return false;
		if (ngayNhap == null) {
			if (other.ngayNhap != null)
				return false;
		} else if (!ngayNhap.equals(other.ngayNhap))
			return false;
		if (nhanVien == null) {
			if (other.nhanVien != null)
				return false;
		} else if (!nhanVien.equals(other.nhanVien))
			return false;
		if (tenDC == null) {
			if (other.tenDC != null)
				return false;
		} else if (!tenDC.equals(other.tenDC))
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
		return "DungCu [maDC=" + maDC + ", tenDC=" + tenDC + ", loaiDC=" + loaiDC + ", ngayNhap=" + ngayNhap + ", hsd="
				+ hsd + ", giaMua=" + giaMua + ", quanTri=" + nhanVien + ", thoiGianCapNhat=" + thoiGianCapNhat + "]";
	}

	@Override
	public int compareTo(DungCu o) {
		// TODO Auto-generated method stub
		return this.maDC.compareTo(o.maDC);
	}
}
