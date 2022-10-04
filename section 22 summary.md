Nama: Anderi Putri Mungkur 
Kelas: QE B 
SECTION 22 
FUNDAMENTAL PERFORMA TEST 
SUMMARY: 

Ada tiga poin yang akan di bahas di materi kali ini yaitu:
1.	Apa itu performance test 
2.	Metode performa test 
3.	Tools apa saja yang digunakan 

1.	Performance test merupakan tehnik non fungtional testing untuk menentukan parameter system dalam hal responsive dan stabilitas di bawa berbagai beban atau lood kerja. Performance testing mengukur kualitas atribut dari sstem seperti stabilitas, ketahanan, dan penggunaan resource. 

Contoh kasus performance test seperti dibawah:
Sebuah system baru yang akan di launch ke production, namun sebelum masuk ke production perlu dilakukan performance test untuk mengetahui throughout dan response time dari system tersebut. 
Untuk informasi endpoint yang akan di test adalah: 
1.	/login
2.	/beli_pulsa
3.	/cek_out

Apa yang di ukur dari performance test?
-	Performa suatu aplikasi sampai suatu batas tertentu 
-	Bukan merupakan fungtional test 
-	Bisa dalam berbagai macam bentuk untuk memahami reliability, stability dan availability pada environmentnya. 
Seperti contoh:
-	Mengamati response time ketika menjalankan request dalam jumlh yang sangat bnyak. 
-	Melihat suatu system berinteraksi dengan jumlah data yang cukup besar.
Langkah yang akan dilakukan adalah sebagai berikut:
•	Membuat test plan 
•	Membuat scrip test 
•	Melakukan performance test 
•	Menganalisa hasil performance test


2.	 Metode performance test yaitu dengan cara:
•	Membuat test plan 
Kita harus mengenali apa yang dibutuhkan
•	Endpoint yang akan ditest:
	 /login
	/ beli_pulsa
	/cek_out
•	Kebutuhan masing-masing endpoint:
- username dan password untuk endpoint/login 
- produk, denom dan nomor untuk pengetesan untuk endpoint/beli_pulsa 
- metode pembayaran yang dipilih untuk endpoint/cek_out
•	Menentukan metode test:
- pilih berdasarkan kondisi system, apakah belum pernah di test atau sudah 
- selalu awali dengan lood test untuk tahu kondisi awal system 
- pilih berdasarkan kondisi yang akan dihapus, 

3.	Tools-tools apasaja yang digunakan yaitu: 
-	Spike testing 
-	Soak testing
-	Load testing
-	Smoke testing 
-	Stress testing 
