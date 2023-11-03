# RENTAL COSTUME
## DESKRIPSI PROJEK
Program ini merupakan sebuah program yang berguna untuk admin Rental Costume yang dapat digunakan oleh Admin sebagai User dari pengguna program ini untuk menyimpan data-data costume yang ada pada rentalannya. selain menyimpan program bisa juga melihat apa saja costume yang telah di tambahkan dan dapat menghapus costume serta mengupdate bagian dari costume tersebut.
## FLOWCHART
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/1b4d9d65-58ad-48e3-9f37-0cc30f00f030)
## ERD 
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/64b2fe43-b2a0-4fbb-9583-3a792c1fde5b)
## HIRARKI CLASS
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/70c20e2b-9ddc-453e-841c-3bd74ad92a18)
## SCREENSHOT KODINGAN BESERTA PENJELASAN
### PACKAGE MODEL
#### COSTUME_KARAKTER
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/daedf85d-01ad-4bc9-ac9e-adab37f93768)
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/607b5e9e-bc81-41c0-a276-8d36fbe42581)
pada codingan diatas merupakan entity/entitas yang dimana dalam entitas tersebut memiliki beberapa atribut serta menerapkan prinsip enkapsulasi, di mana atribut-atributnya merupakan variabel privat dan diakses melalui metode getter dan setter.
tetapi tidak semua atributnya menggunakan setter dan getter ada beberapa atribut yang hanya menggunakan getter karena atribut yang hanya menggunakan getter adalah atribut yang tidak dapat diubah
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/08a616b4-24f6-4857-8d27-23157b996c0a)
#### COSTUME_ANIME
Pada codingan diatas merupakan class turunan dari entitas "Costume" yang memiliki atribut tambahan seperti "namaAnime", "namaMangaka", dan "Studio" yang menerapkan rinsip enkapsulasi dengan mengatur atribut-atributnya sebagai variabel privat. Untuk mengakses nilai-nilai atribut ini, digunakan metode-metode getter, tidak menggunakan setter karena atributnya tidak dapat diubah
#### COSTUME_GAME
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/b3cfd523-b2f7-499c-ad1a-58c09e2a0311)
Sama seperti Costume_Anime,Costume_Game ini merupakan class turunan dari entitas "Costume" yang memiliki atribut tambahan seperti "namaGame", "namaPerusahaan", dan "tipeGame" yang menerapkan rinsip enkapsulasi dengan mengatur atribut-atributnya sebagai variabel privat. Untuk mengakses nilai-nilai atribut ini, digunakan metode-metode getter, tidak menggunakan setter karena atributnya tidak dapat diubah.
#### KARYAWAN
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/282e9514-fe57-4f8f-8b74-e810988d51da)
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/b73164de-ede9-4ff0-b54f-c8340561a8fb)
pada codingan diatas merupakan entity/entitas yang dimana dalam entitas tersebut memiliki beberapa atribut serta menerapkan prinsip enkapsulasi, di mana atribut-atributnya merupakan variabel privat dan diakses melalui metode getter dan setter.
tetapi tidak semua atributnya menggunakan setter dan getter ada beberapa atribut yang hanya menggunakan getter karena atribut yang hanya menggunakan getter adalah atribut yang tidak dapat diubah
#### KARYAWAN_PEMASOK
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/ed142016-bdb2-4bfb-b720-6f11094ce235)
Pada codingan diatas merupakan class turunan dari entitas "Karyawan" yang memiliki atribut tambahan seperti "Username" dan "Password" yang menerapkan prinsip enkapsulasi dengan mengatur atribut-atributnya sebagai variabel privat. Untuk mengakses nilai-nilai atribut ini, digunakan metode-metode setter dan getter.
### PACKAGE CONTROL
#### CRUD_Admin
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/4b64c0c0-6cfa-4326-b873-798a75c19cae)
pada codingan diatas terdapat sebuah konstruktor yang menerima parameter Database yang diberikan inisiasi, agar konstuktor dapat digunakan untuk membuat objek pada class "CRUD_Admin" yang akan mengaikan nya pada Database. class "CRUD_Admin" juga menggunakan method public static karena agar dapat diakses dari luar class selaain "CRUD_Admin".
##### CRUD_Admin tambahkanKaryawan()
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/c0e592b1-5f90-4606-bdb1-a03bb33dbef3)
pada codingan diatas merupakan method untuk menambahkan data ke table karyawan kedatabase, yang mengambil parameter dari class Karyawan, yang dimana dideklarasikan sebagai public void agar bisa di akses di luar class, lalu menggunaan void karena menambahkan data kedatabase tidak memerlukan pengembalian nilai, jadi method diatas hanya berfungsih untuk menambahkan data ke database.
##### CRUD_Admin addPelayanan()
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/6fe6e782-bb8a-48cd-963f-27acbe632750)
pada codingan diatas merupakan method untuk menambahkan data table pelayanan kedatabase, yang mengambil parameter dari class Karyawan_Pelayanan, yang dimana dideklarasikan sebagai public void agar bisa di akses di luar class, lalu menggunaan void karena menambahkan data kedatabase tidak memerlukan pengembalian nilai, jadi method diatas hanya berfungsih untuk menambahkan data ke database.
##### CRUD_Admin getAllKaryawan()
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/04bef1f8-4cdb-4377-9e7a-6c52bc6cb676)
pada codingan diatas merupakan method untuk mengambil data dari table pelayanan di database, yang dimana dideklarasikan sebagai public void agar bisa di akses di luar class, lalu menggunaan void karena pengambilan data langsung ditampilkan data pada tabel melalui objek DefaultTableModel, maka dari itu method ini tidak perlu mengembalikan nilai nya.
##### CRUD_Admin hapusKaryawan()

![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/2d11b9d1-9987-41ff-bdc0-4673c216d9c7)

![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/5e656e2f-bafa-4c64-a4aa-5069e22e377b)


pada codingan diatas merupakan method untuk mengahapus data dari table pelayanan dan karyawan pada database, yang dimana dideklarasikan sebagai public static void, Penggunaan metode static void memungkinkan metode ini untuk digunakan tanpa harus membuat objek dari kelasnya dan tidak mengembalikan nilai, sesuai dengan tujuan spesifik metode ini, yaitu menjalankan operasi penghapusan data dari database.
##### CRUD_Admin getKaryawanById()

![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/a32ca421-17f5-411e-acb5-2fd590e47475)

pada codingan diatas merupakan method untuk mengambil nilai dari table karyawan pada database dengan mecocokkan di yang dicari,yang dimana dideklarasikan sebagai public, penggunaan metode public ini memungkin kan untuk mengembalikan nilai.
#### Costume_CRUD
#### Costume_CRUD addCostumeKarakter()
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/27f174b5-8a9e-4dc9-9e92-5251b126c924)
pada codingan diatas merupakan method untuk menambahkan nilai dari table costume_karakter pada database yang mengambil parameter dari class Costume, yang dimana dideklarasikan sebagai public static void agar bisa di akses di luar class, lalu menggunaan void karena menambahkan data kedatabase tidak memerlukan pengembalian nilai, jadi method diatas hanya berfungsih untuk menambahkan data ke database.
#### Costume_CRUD addAnime1
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/d41a89a5-cac0-4776-8e8b-40ff447f4024)
pada codingan diatas merupakan method untuk mmebambahkan nilai ketable  table anime pada database yang mengambil parameter dari class Costume_Anime, yang dimana dideklarasikan sebagai public static void agar bisa di akses di luar class, lalu menggunaan void karena menambahkan data kedatabase tidak memerlukan pengembalian nilai, jadi method diatas hanya berfungsih untuk menambahkan data ke database.
#### Costume_CRUD addGame()
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/f0c3fd6b-3a27-4451-bd61-457e28454e4a)
pada codingan diatas merupakan method untuk mmebambahkan nilai ketable game pada database yang mengambil parameter dari class Costume_game, yang dimana dideklarasikan sebagai public static void agar bisa di akses di luar class, lalu menggunaan void karena menambahkan data kedatabase tidak memerlukan pengembalian nilai, jadi method diatas hanya berfungsih untuk menambahkan data ke database.
#### Costume_CRUD getAllAnime()
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/8bb66e64-e6a8-4406-be86-08b84ec75a9f)
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/b4e70e25-d5cd-4140-bd6e-3f269453717b)
pada codingan diatas merupakan method untuk mengambil semua nilai dari table cotume_karakter dan anime ,yang dimana dideklarasikan sebagai public static, penggunaan metode public statid ini memungkin kan untuk mengembalikan nilai,dan di masukan ke objek tabel. dan untuk pemanggilan nya pemangilan nya tanpa perlu membuat objek 
#### Costume_CRUD getAllGame()
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/f59ab529-76b2-4619-bed4-75a20f6cc906)
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/37a4d5a7-cab0-4ca1-847c-38a55ffde241)

pada codingan diatas merupakan method untuk mengambil semua nilai dari table cotume_karakter dan game ,yang dimana dideklarasikan sebagai public static, penggunaan metode public statid ini memungkin kan untuk mengembalikan nilai lalu memasukan nya di masukan ke objek tabel. dan pemangilan nya tanpa perlu membuat objek 
#### Costume_CRUD getCostumeById()
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/d48e2077-bf06-4536-8f85-e8cd7932c900)
pada codingan diatas merupakan method untuk mengambil semua nilai dari table cotume_karakter ,yang dimana dideklarasikan sebagai public static, penggunaan metode public statid ini memungkin kan untuk mengembalikan nilai lalu. dan pemangilan nya tanpa perlu membuat objek 
#### Costume_CRUD UpdateCostume()
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/ed9cd081-f8e1-48ac-9570-a82f99636272)
Pada codingan diatas merupakan method untuk merubah nilai dari table cotume_karakter pada database ,yang dimana dideklarasikan sebagai public static, penggunaan metode public statid ini memungkin kan untuk mengembalikan nilai lalu. dan pemangilan nya tanpa perlu membuat objek 
#### Costume_CRUD HapusCostume()
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/c70c7967-557e-40f6-a5c8-c88a0e494ecb)
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/39adaa2d-9bea-4506-86c2-5331177d7845)
Pada codingan diatas merupakan method untuk menghapus nilai dari table cotume_karakter, anime atau game pada database  ,yang dimana dideklarasikan sebagai public static, penggunaan metode public statid ini memungkin kan untuk mengembalikan nilai lalu. dan pemangilan nya tanpa perlu membuat objek 
#### Costume_CRUD getAllCostumes()
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/ee9fc534-a1b9-402d-ac93-3f041fa15364)
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/603e2f66-81c2-4785-8986-60000646849a)
Pada codingan diatas merupakan method untuk mengambil semua nilai dari cotume_karakter, anime atau game pada database  ,yang dimana dideklarasikan sebagai public static, penggunaan metode public statid ini memungkin kan untuk mengembalikan nilai dan dimasukan pada objek tabel. dan pemangilan nya tanpa perlu membuat objek
#### Database 
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/fb725d3d-9bc2-4975-976b-3836b7429f91)
method yang digunakan untuk konek ke database 
#### LOGIN 
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/3e6805c7-2be6-4db3-ba86-dbe52e23c706)
Method yang digunakan untuk login 
### Package VIEW
#### Hapus_Admin()
inisiasi serta pemanggilan 
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/cf7de038-7ee5-4287-9006-4905fb97cb9a)
pemangilan menu-menu serta method
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/67b73a61-e255-4c0e-be67-a7ca7ab902c0)
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/4bc261eb-12c5-4c3d-b934-798109e9acb9)
#### Hapus_Costume
inisiasi serta pemanggilan dan penggunaan Overriding
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/a03f3518-e9da-4938-ae16-e922b75cce5a)
codingan button cari dengan memanggil method 
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/59fd1e78-3568-4555-9023-8ed343b0cf5d)
codingan button hapus, dengan memanggil method
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/56ffe6b0-4c01-47e2-bf82-9ad1c7b57f2e)
#### MENU_ADMIN
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/b3fcd357-888f-4ed8-80e2-ea3652ec738a)
#### Menu_Awal
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/9a8a5d78-e030-4401-9b14-7e9a1c96b634)
#### Pilih_Menu
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/6574dc23-1f9a-469a-b110-ffaf5a0404ea)
#### Tambah_Admin
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/62c459f1-7910-409a-8877-e1ae14144239)
codingan buttton lanut yang memanggil method 
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/b237bd16-f7af-4de8-b80c-8f12d0c1f7ff)
#### Tambah_Anime
codimgan botton tambahkan yang memanggil method 
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/a24a2878-ff0f-49dd-b207-6a4e9420ac36)
#### Tambah_Anime2
codingan button tambahkan yang memanggil method 
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/f9982825-03f0-4e67-94a1-170cc9b2231c)
#### Tambah_Game
codingan button tambahkan yang memanggil method
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/92f3409f-2ecf-4869-82e1-a58842488125)
#### Tambah_Game2
codingan button tambahkan yang memanggil method
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/19dae9ed-443d-4d71-a841-7c38bdab5147)
#### Tambah_Pelayanan
codingan button tambahkan yang memanggil method
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/32530bdc-34ac-4795-a193-02fd6e90747d)
#### Tampilan_Anime
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/b4882c33-73c5-4394-8738-87d3aa6fb41d)
#### Tampilan_DataAdmin
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/64d018a4-8fec-422b-96ac-a4541169b3d0)
#### Tampilkan_Costume
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/ab36a8f1-a8db-4da0-abbc-de9eb1b9b66c)
#### Tampilkan_Game
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/0086889b-7822-47f1-8d40-45fccd70e388)
#### Update_Costume
inisiasi serta pemanggilan dan penggunaan Overriding
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/9978fac6-1d0f-4e02-9880-e4e16ea9a062)
#### Update_Costume
codingan button cari
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/9d2ff415-35db-4388-9acf-fa7dd580a7b6)
codingan button ubah
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/74439cff-4ebf-445b-844d-bc7720b00f04)
## Screenshot Output
### Jframe Hapus_Anime
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/27968ec7-46f9-47b4-a499-bfd04130ac17)

### Jframe Hapus_Costume
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/7726782a-1cfa-4de7-b2bf-df63bc021b5c)

### Jframe Login
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/b5ac9ea0-f1c9-412e-9a6a-d0fc18bf5b9a)

### Jframe Menu_Admin
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/3f68c29a-c470-4488-9f2c-7eb33e9f15ba)

### Jframe Manu_Awal
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/46cfc061-88d6-44f0-b85a-d32c0f6ab196)

### Jframe Pilihan_Menu
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/d79ee521-4d82-4604-b348-931a503f0c27)

### Jframe Tambah_Admin
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/3fc2eed9-95ba-4c59-b546-523400c131f0)

### Jframe Tambah_Anime
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/0c92fae6-244c-4891-8234-fa60d850792d)

### Jframe Tambah_Game
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/c98fc520-dd97-4e7d-b386-9ced3972478f)



### Jframe Tambah_Game2
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/15d46844-1e60-4172-a4da-a71c2931346b)



### Jframe Tambah_Palayanan
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/df9bc554-39c3-448f-8c9a-3576a417faf8)

### Jframe Tampilan Anime
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/9d90344b-46f4-47f8-b9cb-66940912de1f)

### Jframe Tampilan DataAdmin
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/a041b4e7-6b81-4cd0-b825-45ade4a06706)

### Jframe Tampilan_Costume
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/af5489fd-83e9-4dbc-8714-f4e68517fe9d)

### Jframe Tampilan_Game
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/3dbe22fd-0bc9-4616-b706-b268343a306c)

### Jframe Update_Admin

![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/b9f27e1d-7c06-40d7-bd6e-52c6b4aa9088)


### Jframe Update_Costume
![image](https://github.com/selaputriismalia/Kelompok4_PA_PBO/assets/88119620/e4959abb-f15d-405f-805f-a79ae9cbb699)



































































