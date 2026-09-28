import os
import shutil

src_mascots = r"c:\Users\Usuario\Downloads\kotlin multi--rastro- no borrar\copia rastro react\public\assets\mascots"
dest = r"c:\Users\Usuario\Downloads\kotlin multi--rastro- no borrar\androidApp\src\main\res\drawable"

for fname in os.listdir(src_mascots):
    if fname.endswith(".png"):
        new_name = fname.lower().replace("-", "_")
        shutil.copy2(os.path.join(src_mascots, fname), os.path.join(dest, new_name))
        print(f"Copied {fname} -> {new_name}")

src_assets = r"c:\Users\Usuario\Downloads\kotlin multi--rastro- no borrar\copia rastro react\public\assets"
shutil.copy2(os.path.join(src_assets, "ARTYON.png"), os.path.join(dest, "artyon_banner.png"))
shutil.copy2(os.path.join(src_assets, "ORSTYY_ARTYON.png"), os.path.join(dest, "orstty_artyon.png"))
shutil.copy2(os.path.join(src_assets, "ORSTYY_ARTYON2.png"), os.path.join(dest, "orstty_artyon2.png"))

src_public = r"c:\Users\Usuario\Downloads\kotlin multi--rastro- no borrar\copia rastro react\public"
shutil.copy2(os.path.join(src_public, "applogo.png"), os.path.join(dest, "app_logo.png"))
shutil.copy2(os.path.join(src_public, "astrologo.png"), os.path.join(dest, "astro_logo.png"))
print("Done copying all assets!")
