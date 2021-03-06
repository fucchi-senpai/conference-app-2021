package io.github.droidkaigi.feeder.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.droidkaigi.feeder.staff.StaffViewModel
import javax.inject.Inject
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.receiveAsFlow

@HiltViewModel
class RealStaffViewModel @Inject constructor(
//    private val repository: StaffRepository,
) : ViewModel(), StaffViewModel {
    override val state: StateFlow<StaffViewModel.State> = TODO()
    private val effectChannel = Channel<StaffViewModel.Effect>(Channel.UNLIMITED)
    override val effect: Flow<StaffViewModel.Effect> = effectChannel.receiveAsFlow()
    override fun event(event: StaffViewModel.Event) {
        TODO("Not yet implemented")
    }
}
