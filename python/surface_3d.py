import matplotlib.pyplot as plt
import numpy as np
from matplotlib import cm
plt.style.use("_mpl-gallery")

x = np.arange(-5, 5, 0.25)
y = np.arange(-5, 5, 0.25)
x, y = np.meshgrid(x, y)

R = np.sqrt(x**2 + y**2)
Z = np.sin(R)

fig, ax = plt.subplots(subplot_kw={"projection": "3d"})
ax.plot_surface(x, y, Z, vmin=Z.min()*2, cmap=cm.Blues)

ax.set(xticklabels=[], yticklabels=[], zticklabels=[])
plt.show()
