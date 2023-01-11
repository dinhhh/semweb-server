# Cách chạy Fuseki
./fuseki-server --file=/home/dinh/Documents/HUST/20221/semantic-web/rdf/mobile-phone/abox-mobile-phone.ttl --file=/home/dinh/Documents/HUST/20221/semantic-web/rdf/mobile-phone/tbox-mobile-phone.ttl /name

# Suy diễn sử dụng Apache Jena
1. Xác định phân khúc điện thoại
- Cách 1: Dựa vào giá tiền
    - Phân chia thành 3 phân khúc: Giá rẻ; Trung cấp; Cận cao cấp; Flagship
    - Cách phân loại

Phân khúc | Giá rẻ | Trung cấp | Cận cao cấp | Flagship
--- | --- | --- | --- | ---
Giá | < 10M VNĐ | 10M - 15M VNĐ | 15M - 20M VNĐ | > 20M VNĐ

Tham khảo: https://daidoangia.vn/tin-tuc/tim-hieu-cac-phan-khuc-smartphone-tren-thi-truong-hien-nay

- Cách 2: Dựa vào cấu hình điện thoại
	- Phân chia thành 3 phân khúc: Low-end; Mid-range; High-end
    - Các tiêu chí phân loại:

Category | Low-end | Mid-range | High-end 
--- | --- | --- | --- 
Display | 480p - 720p | 1080p | 1440p
Ram | < 2GB | 2GB - 3GB | > 3GB 
Main camera | < 48 MB | 48MB - 108 MB | > 108 MB
Selfie camera | < 12 MP | 12MB - 40MB | > 40MB

Tham khảo: https://www.xda-developers.com/how-do-you-define-smartphone-categories-price-or-specs/