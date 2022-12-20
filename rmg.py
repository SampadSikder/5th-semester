import cv2
vidcap = cv2.VideoCapture('/content/drive/MyDrive/Cocurriculur/RMG Project/Dataset/churachuri.mp4')
success,image = vidcap.read()
count = 0
while success:
  cv2.imwrite("%d.jpg" % count, image)     # save frame as JPEG file      
  success,image = vidcap.read()
  print('Read a new frame: ', success)
  count += 1
  if count>=500:
    break