package com.codewithsanju.service;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

public class FaceRecognition {

	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

		// Load the pre-trained model for detecting faces
		CascadeClassifier faceDetector = new CascadeClassifier();
		faceDetector.load("E:\\Myfiles\\haarcascade_frontalface_default.xml"); // Path to the face detection XML file

		// Load the image
		Mat image = Imgcodecs.imread("C:\\Users\\Sanju\\OneDrive\\Desktop\\midjourney\\ramcharan.jpg"); // Replace
																										// "path_to_image"
																										// with your
																										// image path

		// Detect faces in the image
		MatOfRect faceDetections = new MatOfRect();
		faceDetector.detectMultiScale(image, faceDetections);

		// Draw rectangles around detected faces
		for (org.opencv.core.Rect rect : faceDetections.toArray()) {
			Imgproc.rectangle(image, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height),
					new Scalar(0, 255, 0), 3);
		}

		// Display the image with detected faces
		HighGui.imshow("Detected Face", image);
		HighGui.waitKey();
	}
}

