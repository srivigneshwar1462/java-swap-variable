import matplotlib.pyplot as plt
import numpy as np
# x = np.linspace(0,10,100)
# plt.subplot(2,2,1)
# plt.plot(x, np.sin(x))
# print(plt.gcf())
# print(plt.gca())
# plt.subplot(2,2,3)
# plt.plot(x, np.cos(x));
# print(plt.gca())
# plt.show()

x = [1,3,5,7,9]
y = [0,3,4,6,8]

plt.plot(x,y)
plt.xlabel('x axis')
plt.ylabel('y axis')
plt.title('test diagram')
plt.legend(['line 1'])
plt.savefig('plot.png', dpi = 300, bbox_inches='tight')
plt.show()