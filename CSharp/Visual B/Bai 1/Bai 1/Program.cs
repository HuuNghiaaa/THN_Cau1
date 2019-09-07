using System;

namespace Bai_1
{
    class Program
    {
        static void Main(string[] args)
        {
            string strSoNguyen; // Biến chứa dữ liệu nhập vào từ bàn phím
            int SoNguyen; // Biến chứa số nhập vào từ bàn phím
            string KetQua; // Biến chứa kết quả kiểm tra số vừa nhập là chẵn hay lẻ
            strSoNguyen = Console.ReadLine(); // Đọc dữ liệu nhập vào từ bàn phím (dữ liệu này ở dạng chuỗi) sau đó gán giá trị vào biến strSoNguyen
            SoNguyen = Int32.Parse(strSoNguyen); // Ép kiểu dữ liệu vừa nhập và (dạng chuỗi) sang dạng số rồi gán giá trị vào biến SoNguyen
            KetQua = (SoNguyen % 2 == 0) ? "so chan" : "so le"; // Sử dụng toán tử 3 ngôi để kiểm tra số chẵn lẻ

            Console.WriteLine("{0} la {1}", SoNguyen, KetQua); // In kết quả ra màn hình

            Console.ReadKey();
        }

    }
}
