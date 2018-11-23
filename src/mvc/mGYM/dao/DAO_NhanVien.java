package mvc.mGYM.dao;

import mvc.mGYM.model.NhanVien;
import mvc.mGYM.utils.ObjectDAO;

public class DAO_NhanVien extends ObjectDAO<NhanVien> {
	public DAO_NhanVien() {
		this.table = "NhanVien";
	}
}
