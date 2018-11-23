package mvc.mGYM.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
public class TaiKhoanThanhVien extends TaiKhoan {

	@OneToOne(fetch = FetchType.EAGER)
	public ThanhVien thanhVien;

	public TaiKhoanThanhVien() {

	}

	public TaiKhoanThanhVien(ThanhVien thanhVien) {

		this.thanhVien = thanhVien;
	}

	public ThanhVien getThanhVien() {
		return thanhVien;
	}

	public void setThanhVien(ThanhVien thanhVien) {
		this.thanhVien = thanhVien;
	}

}
