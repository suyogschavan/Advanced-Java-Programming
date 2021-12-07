# (c) Clemens Brunner, licensed under the BSD 3-Clause license

import mne.datasets
import numpy as np
import os

raw = mne.io.read_raw_edf("S001R04.edf", preload=True)
mne.set_log_level("WARNING")
raw