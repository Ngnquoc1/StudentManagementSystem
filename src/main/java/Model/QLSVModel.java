package Model;

import java.util.ArrayList;

public class QLSVModel {
    private ArrayList dsThiSinh;
    private String luaChon;
    private String tenFile;

    public QLSVModel() {
        this.dsThiSinh = new ArrayList();
        this.luaChon = "";
        this.tenFile="";
    }

    public QLSVModel(ArrayList dsThiSinh) {
        this.dsThiSinh = dsThiSinh;
    }

    public ArrayList getDsThiSinh() {
        return dsThiSinh;
    }

    public void setDsThiSinh(ArrayList dsThiSinh) {
        this.dsThiSinh = dsThiSinh;
    }

    public void insert(ThiSinh thiSinh) {
        this.dsThiSinh.add(thiSinh);
    }

    public void delete(ThiSinh thiSinh) {
        for(int i = 0; i< dsThiSinh.size();i++){
            ThiSinh TS= (ThiSinh) dsThiSinh.get(i);
            if(TS.getMaThiSinh()==thiSinh.getMaThiSinh()){
                dsThiSinh.remove(TS);
                break;
            }
        }
    }

    public void update(ThiSinh thiSinh) {
        this.dsThiSinh.remove(thiSinh);
        this.dsThiSinh.add(thiSinh);
    }

    public String getLuaChon() {
        return luaChon;
    }

    public void setLuaChon(String luaChon) {
        this.luaChon = luaChon;
    }

    public String getTenFile() {
        return tenFile;
    }

    public void setTenFile(String tenFile) {
        this.tenFile = tenFile;
    }

    public boolean kiemTraTonTai(ThiSinh ts) {
        for(int i = 0 ; i < dsThiSinh.size() ; i++) {
            ThiSinh TS= (ThiSinh) dsThiSinh.get(i);
            if(TS.getMaThiSinh().equals(ts.getMaThiSinh())) {
                return true;
            }
        }
        return false;
    }
    public ThiSinh getThiSinhById(String id)
    {
        for(int i = 0 ; i < dsThiSinh.size() ; i++) {
            ThiSinh TS= (ThiSinh) dsThiSinh.get(i);
            if(TS.getMaThiSinh().equals(id)) {
                return TS;
            }
        }
        return null;
    }
    public ArrayList<ThiSinh> getThiSinhByBp(Tinh tinh){
        ArrayList<ThiSinh> ds=new ArrayList<ThiSinh>();
        for(int i = 0 ; i < dsThiSinh.size() ; i++) {
            ThiSinh TS= (ThiSinh) dsThiSinh.get(i);
            if(TS.getQueQuan().equals(tinh)) {
                ds.add(TS);
            }
        }
        return ds;
    }

}