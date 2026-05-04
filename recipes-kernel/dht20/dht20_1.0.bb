SUMMARY = "DHT20 I2C humidity/temperature IIO kernel driver"
DESCRIPTION = "Out-of-tree Linux kernel module for ASAIR DHT20 sensor via IIO subsystem"
AUTHOR = "Trung Ha <hachitrung024@gmail.com>"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

inherit module

SRC_URI = "git://github.com/hachitrung024/kernel-drivers.git;protocol=https;branch=main"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git/iio/humidity"

KERNEL_MODULE_AUTOLOAD += "dht20"

RDEPENDS:${PN} += "kernel-module-industrialio kernel-module-dht20"
