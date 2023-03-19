package Cau2lab6;

public class HocSinhChuyenToan extends HocSinh {
    public HocSinhChuyenToan(){

    }
    @Override
    public double diemtrungbinh(){
        return (super.getHoa()+super.getLy()+super.getToan()*2)/4;
    }
}