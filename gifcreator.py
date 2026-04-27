import imageio.v3 as iio

filenames = ['im1.jpg', 'im2.jpg']
images = []

for filename in filenames:
    images.append(iio.imread(filename))

iio.imwrite('output.gif', images, duration=500, loop=0)
