def basamaklarin_toplami(sayi):
    toplam = 0
    while sayi > 0:
        basamak = sayi % 10
        toplam += basamak
        sayi //= 10
    return toplam

try:
    girilen_sayi = int(input("Bir sayı girin: "))
    sonuc = basamaklarin_toplami(girilen_sayi)
    print(f"{girilen_sayi} = {'+'.join(str(d) for d in str(girilen_sayi))} = {sonuc}")
except ValueError:
    print("Geçerli bir sayı girmediniz!")
